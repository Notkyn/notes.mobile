package ua.notky.notes.gui.presenter.main;

import ua.notky.notes.util.enums.LoadDataMode;

public interface MainPresenter {
    void save();
    void startLoadData(LoadDataMode mode);
    void setView(MainView view);
}