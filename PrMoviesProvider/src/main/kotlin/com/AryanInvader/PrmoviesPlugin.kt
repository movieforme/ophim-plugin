package com.aryanInvader

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class PRMoviesPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(PRMoviesProvider())
    }
}
