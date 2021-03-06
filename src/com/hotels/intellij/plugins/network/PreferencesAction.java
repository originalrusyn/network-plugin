/**
 * Copyright 2017 Expedia Inc.
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
package com.hotels.intellij.plugins.network;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.util.IconLoader;

/**
 * Button to open the preferences dialog.
 */
public class PreferencesAction extends AnAction {

    public PreferencesAction() {
        super("Preferences", "Open the preferences dialog", IconLoader.findIcon("/general/settings.png"));
    }

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        PreferencesDialog preferencesDialog = new PreferencesDialog(anActionEvent.getProject());
        preferencesDialog.show();
    }
}
