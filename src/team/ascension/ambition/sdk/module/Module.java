package team.ascension.ambition.sdk.module;

import team.ascension.ambition.sdk.setting.ISetting;

import java.util.List;

public class Module implements IModule {

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public ISetting<?> getKeybind() {
        return null;
    }

    @Override
    public String getSuffix() {
        return "";
    }

    @Override
    public Category getCategory() {
        return null;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void setEnabled(final boolean state, final boolean silent) {

    }

    @Override
    public void setEnabled(final boolean state) {

    }

    @Override
    public void toggle() {

    }

    @Override
    public List<ISetting<?>> getSettings() {
        return ;
    }

}
