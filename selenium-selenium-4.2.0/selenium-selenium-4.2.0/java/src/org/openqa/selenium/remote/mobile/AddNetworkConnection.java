// Licensed to the Software Freedom Conservancy (SFC) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The SFC licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.openqa.selenium.remote.mobile;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.remote.AugmenterProvider;
import org.openqa.selenium.remote.ExecuteMethod;

import java.util.function.Predicate;

import static org.openqa.selenium.remote.CapabilityType.SUPPORTS_NETWORK_CONNECTION;

/**
 * @deprecated Uses a non W3C compliant capability and is not available in W3C WebDriver sessions
 */
@Deprecated
public class AddNetworkConnection implements AugmenterProvider<NetworkConnection> {

  @Override
  public Predicate<Capabilities> isApplicable() {
    return caps -> caps.is(SUPPORTS_NETWORK_CONNECTION);
  }

  @Override
  public Class<NetworkConnection> getDescribedInterface() {
    return NetworkConnection.class;
  }

  @Override
  public NetworkConnection getImplementation(Capabilities capabilities, ExecuteMethod executeMethod) {
    return new RemoteNetworkConnection(executeMethod);
  }
}
