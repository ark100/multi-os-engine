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

#include "dex/pass_me.h"

// This was automatically generated by /Volumes/Android/inde-dev//art/tools/generate-operator-out.py --- do not edit!
namespace art {
std::ostream& operator<<(std::ostream& os, const OptimizationFlag& rhs) {
  switch (rhs) {
    case kOptimizationBasicBlockChange: os << "OptimizationBasicBlockChange"; break;
    case kOptimizationDefUsesChange: os << "OptimizationDefUsesChange"; break;
    case kLoopStructureChange: os << "LoopStructureChange"; break;
    default: os << "OptimizationFlag[" << static_cast<int>(rhs) << "]"; break;
  }
  return os;
}
}  // namespace art

// This was automatically generated by /Volumes/Android/inde-dev//art/tools/generate-operator-out.py --- do not edit!
namespace art {
std::ostream& operator<<(std::ostream& os, const DataFlowAnalysisMode& rhs) {
  switch (rhs) {
    case kAllNodes: os << "AllNodes"; break;
    case kPreOrderDFSTraversal: os << "PreOrderDFSTraversal"; break;
    case kRepeatingPreOrderDFSTraversal: os << "RepeatingPreOrderDFSTraversal"; break;
    case kReversePostOrderDFSTraversal: os << "ReversePostOrderDFSTraversal"; break;
    case kRepeatingPostOrderDFSTraversal: os << "RepeatingPostOrderDFSTraversal"; break;
    case kRepeatingReversePostOrderDFSTraversal: os << "RepeatingReversePostOrderDFSTraversal"; break;
    case kPostOrderDOMTraversal: os << "PostOrderDOMTraversal"; break;
    case kTopologicalSortTraversal: os << "TopologicalSortTraversal"; break;
    case kLoopRepeatingTopologicalSortTraversal: os << "LoopRepeatingTopologicalSortTraversal"; break;
    case kNoNodes: os << "NoNodes"; break;
    default: os << "DataFlowAnalysisMode[" << static_cast<int>(rhs) << "]"; break;
  }
  return os;
}
}  // namespace art
