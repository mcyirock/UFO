package complex.digital.gangneung.festivals;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import complex.digital.gangneung.festivals.VO.Event_VO;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OneFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link OneFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OneFragment extends Fragment {

    private static String Frag_one;
    private static String Frag_two;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public OneFragment() {
        // Required empty public constructor
    }


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OneFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OneFragment newInstance(String param1, String param2) {
        OneFragment fragment = new OneFragment();

        Frag_one = param1;
        Frag_two = param2;

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);


        Event_VO vo = new Event_VO(Frag_one);
        TextView tv = (TextView) view.findViewById(R.id.one_text);
        tv.setText(vo.getInfo_info_text());
        ImageView iv = (ImageView) view.findViewById(R.id.one_pic);
        int pic = getActivity().getApplicationContext().getResources().getIdentifier(vo.getInfo_info_pic(), "drawable", getActivity().getApplicationContext().getPackageName());
        iv.setImageResource(pic);
        TextView tv1 = (TextView) view.findViewById(R.id.one_title);
        tv1.setText(vo.getTitle());
        ImageView iv1 = (ImageView) view.findViewById(R.id.one_logo);
        int pic1 = getActivity().getApplicationContext().getResources().getIdentifier(vo.getLogo(), "drawable", getActivity().getApplicationContext().getPackageName());
        iv1.setImageResource(pic1);

        return view;
    }

}
