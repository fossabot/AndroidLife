package com.camnter.multi.classloader.plugin.three;

import com.camnter.multi.classloader.plugin.host.plugin.PluginInterface;

/**
 * @author CaMnter
 */

public class PluginThreeImplment implements PluginInterface {

    @Override
    public String getInfo() {
        return "Here's plugin three";
    }

}
