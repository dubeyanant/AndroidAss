import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;

public class CountryViewAdapter extends ArrayAdapter<Country> {
    // invoke the suitable constructor of the ArrayAdapter class
    public CountryViewAdapter(@NonNull Context context, ArrayList<Country> arrayList) {

        // pass the context and arrayList for the super
        // constructor of the ArrayAdapter class
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // convertView which is recyclable view
        View currentItemView = convertView;

        // of the recyclable view is null then inflate the custom layout for the same
        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_view, parent, false);
        }

        // get the position of the view from the ArrayAdapter
        NumbersView currentNumberPosition = getItem(position);

        // then according to the position of the view assign the desired image for the same
        ImageView numbersImage = currentItemView.findViewById(R.id.imageView);
        assert currentNumberPosition != null;
        numbersImage.setImageResource(currentNumberPosition.getNumbersImageId());

        // then according to the position of the view assign the desired TextView 1 for the same
        TextView textView1 = currentItemView.findViewById(R.id.textView1);
        textView1.setText(currentNumberPosition.getNumberInDigit());

        // then according to the position of the view assign the desired TextView 2 for the same
        TextView textView2 = currentItemView.findViewById(R.id.textView2);
        textView2.setText(currentNumberPosition.getNumbersInText());

        // then return the recyclable view
        return currentItemView;
    }
}
