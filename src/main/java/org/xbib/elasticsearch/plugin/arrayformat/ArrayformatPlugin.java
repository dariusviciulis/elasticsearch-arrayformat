
package org.xbib.elasticsearch.plugin.arrayformat;

import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.rest.RestModule;
import org.xbib.elasticsearch.rest.arrayformat.ArrayformatRestSearchAction;

public class ArrayformatPlugin extends AbstractPlugin {

    @Override
    public String name() {
        return "arrayformat-"
                + Build.getInstance().getVersion() + "-"
                + Build.getInstance().getShortHash();
    }

    @Override
    public String description() {
        return "REST arrayformat plugin";
    }


    public void onModule(RestModule module) {
        module.addRestAction(ArrayformatRestSearchAction.class);
    }

}
