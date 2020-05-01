package org.moe.samples.elements.android;

import android.content.res.AssetManager;
import android.util.Log;

import org.moe.samples.elements.common.AtomicElement;
import org.longevitysoft.android.xml.plist.PListXMLHandler;
import org.longevitysoft.android.xml.plist.PListXMLParser;
import org.longevitysoft.android.xml.plist.domain.Array;
import org.longevitysoft.android.xml.plist.domain.Dict;
import org.longevitysoft.android.xml.plist.domain.PList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PeriodicElements {

    private final static String TAG = "PeriodicElements";

    // We use the singleton approach, one collection for the entire application
    public static List<AtomicElement> elements = null; // Original, sorted by name

    public static void setupElementsArray(AssetManager assetManager) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(assetManager.open("Elements.plist"), "UTF-8"));
            String plist = "";
            String line = reader.readLine();
            while (line != null) {
                plist += line + "\n";
                line = reader.readLine();
            }
            // TODO: Move to common
            PListXMLHandler handler = new PListXMLHandler();
            PListXMLParser parser = new PListXMLParser();
            parser.setHandler(handler);
            parser.parse(plist);
            PList actualPList = ((PListXMLHandler) parser.getHandler()).getPlist();
            if (actualPList != null) {
                Array array = (Array) actualPList.getRootElement();
                int size = array.size();

                elements = new ArrayList<>(size);
                for (int i = 0; i < size; ++i) {
                    Dict cat = (Dict) array.get(i);
                    AtomicElement AtomicElement = new AtomicElement(cat);
                    elements.add(AtomicElement);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG, "Exception:", e);
        }
    }
}
