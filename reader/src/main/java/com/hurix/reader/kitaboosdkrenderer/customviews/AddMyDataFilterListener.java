package com.hurix.reader.kitaboosdkrenderer.customviews;

import java.util.ArrayList;

public interface AddMyDataFilterListener {

    void onApplyButtonClicked(ArrayList<String> selectedColorList);

    void onNoteFilterApplyButtonClicked(ArrayList<String> notelist, ArrayList<String> contextNoteList);
}
