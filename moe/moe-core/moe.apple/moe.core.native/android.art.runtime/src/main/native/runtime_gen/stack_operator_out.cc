/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/


#include <iostream>

#include "stack.h"

// This was automatically generated by /Volumes/Android/inde-dev//art/tools/generate-operator-out.py --- do not edit!
namespace art {
std::ostream& operator<<(std::ostream& os, const StackVisitor::StackWalkKind& rhs) {
  switch (rhs) {
    case StackVisitor::StackWalkKind::kIncludeInlinedFrames: os << "IncludeInlinedFrames"; break;
    case StackVisitor::StackWalkKind::kSkipInlinedFrames: os << "SkipInlinedFrames"; break;
  }
  return os;
}
}  // namespace art

// This was automatically generated by /Volumes/Android/inde-dev//art/tools/generate-operator-out.py --- do not edit!
namespace art {
std::ostream& operator<<(std::ostream& os, const VRegKind& rhs) {
  switch (rhs) {
    case kReferenceVReg: os << "ReferenceVReg"; break;
    case kIntVReg: os << "IntVReg"; break;
    case kFloatVReg: os << "FloatVReg"; break;
    case kLongLoVReg: os << "LongLoVReg"; break;
    case kLongHiVReg: os << "LongHiVReg"; break;
    case kDoubleLoVReg: os << "DoubleLoVReg"; break;
    case kDoubleHiVReg: os << "DoubleHiVReg"; break;
    case kConstant: os << "Constant"; break;
    case kImpreciseConstant: os << "ImpreciseConstant"; break;
    case kUndefined: os << "Undefined"; break;
    default: os << "VRegKind[" << static_cast<int>(rhs) << "]"; break;
  }
  return os;
}
}  // namespace art
