/*
 * Copyright (c) 2014. William Mora
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

package com.gamestudio24.martianrun.actors.menu;

import com.badlogic.gdx.math.Rectangle;
import com.gamestudio24.martianrun.config.ConfigLoader;

public class ExitButton extends ImageGameButton {

    public interface ExitButtonListener {
        public void onExit();
    }

    private ExitButtonListener listener;

    public ExitButton(Rectangle bounds, ExitButtonListener listener) {
        super(bounds);
        this.listener = listener;
    }

    @Override
    protected String getRegionName() {
        return ConfigLoader.getConfig().getExitButton().getImagePath();
    }

    @Override
    public void touched() {
        listener.onExit();
    }

}