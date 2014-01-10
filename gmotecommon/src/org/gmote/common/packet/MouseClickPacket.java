/**
 * Copyright 2009 Marc Stogaitis and Mimi Sun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gmote.common.packet;

import org.gmote.common.Protocol.Command;
import org.gmote.common.Protocol.MouseEvent;

public class MouseClickPacket extends AbstractPacket {
  MouseEvent mouseEvent;

  public MouseClickPacket(MouseEvent mouseEvent) {
    super(Command.MOUSE_CLICK_REQ);
    this.mouseEvent = mouseEvent;
  }

  public MouseEvent getMouseEvent() {
    return mouseEvent;
  }

  private static final long serialVersionUID = 1L;

}
