// Copyright 2023 Citra Emulator Project
// Licensed under GPLv2 or any later version
// Refer to the license.txt file included.

package io.github.lime3ds.ui.main

interface ThemeProvider {
    /**
     * Provides theme ID by overriding an activity's 'setTheme' method and returning that result
     */
    var themeId: Int
}
