// Copyright (c) 2015, Intel Corporation
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are
// met:
//
// 1. Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above
// copyright notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
// 3. Neither the name of the copyright holder nor the names of its
// contributors may be used to endorse or promote products derived from
// this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
// HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package org.moe.samples.simplenetworkstreams.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.moe.samples.simplenetworkstreams.android.R;
import org.moe.samples.simplenetworkstreams.common.Networking;
import org.moe.samples.simplenetworkstreams.common.SocketServerThreadBase;

public class ServerFragment extends Fragment {

    private static final String TAG = "ServerFragment";

    TextView addressTextView, portTextView, logTextView;
    Button clearButton;
    private SocketServerThread socketServerThread;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_server, container, false);

        addressTextView = (TextView) rootView.findViewById(R.id.address);
        portTextView = (TextView) rootView.findViewById(R.id.port);
        logTextView = (TextView) rootView.findViewById(R.id.log);

        clearButton = (Button) rootView.findViewById(R.id.clear);

        clearButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                logTextView.setText("");
            }
        });

        String ipAddress = Networking.getIpAddress();
        addressTextView.setText(ipAddress);

        socketServerThread = new SocketServerThread();
        socketServerThread.start();

        return rootView;
    }

    private class SocketServerThread extends SocketServerThreadBase {

        @Override
        public void onInfo(final String message) {
            getActivity().runOnUiThread(new Runnable() {

                @Override
                public void run() {
                    portTextView.setText(message);
                }
            });
        }

        @Override
        public void onLog(final String message) {
            getActivity().runOnUiThread(new Runnable() {

                @Override
                public void run() {
                    logTextView.setText(logTextView.getText() + message + "\n");
                }
            });
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "--- onDestroy");

        if (socketServerThread.isAlive()) {
            socketServerThread.close();
        }
    }
}