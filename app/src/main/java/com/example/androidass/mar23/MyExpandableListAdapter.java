package com.example.androidass.mar23;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.androidass.R;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MyExpandableListAdapter extends BaseExpandableListAdapter {

    private final Context context;
    private final Map<String, List<String>> sportsCountriesCollection;
    private final List<String> sports;

    public MyExpandableListAdapter(Context context, List<String> sports, Map<String, List<String>> sportsCountriesCollection) {
        this.context = context;
        this.sportsCountriesCollection = sportsCountriesCollection;
        this.sports = sports;
    }

    @Override
    public int getGroupCount() {
        return sportsCountriesCollection.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return Objects.requireNonNull(sportsCountriesCollection.get(sports.get(groupPosition))).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return sports.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return Objects.requireNonNull(sportsCountriesCollection.get(sports.get(groupPosition))).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String sportsName = sports.get(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.group_item, null);
        }

        TextView item = convertView.findViewById(R.id.groupItem);
        item.setText(sportsName);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String model = Objects.requireNonNull(sportsCountriesCollection.get(sports.get(groupPosition))).get(childPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.child_item, null);
        }
        TextView item = convertView.findViewById(R.id.childItem);
        item.setText(model);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}