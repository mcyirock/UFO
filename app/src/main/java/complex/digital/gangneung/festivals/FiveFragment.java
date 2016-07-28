package complex.digital.gangneung.festivals;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import complex.digital.gangneung.festivals.VO.Event_VO;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FiveFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FiveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FiveFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static String ARG_PARAM1 = "param1";
    private static String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public FiveFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ThreeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FiveFragment newInstance(String param1, String param2) {
        FiveFragment fragment = new FiveFragment();
        ARG_PARAM1 = param1;
        ARG_PARAM2 = param2;

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_five, container, false);


        Event_VO vo = new Event_VO(ARG_PARAM1);
        TextView tv = (TextView) view.findViewById(R.id.five_text);
        tv.setText(vo.getInfo_contact_text());
        ImageView iv = (ImageView) view.findViewById(R.id.five_pic);
        int pic = getActivity().getApplicationContext().getResources().getIdentifier(vo.getInfo_contact_pic(), "drawable", getActivity().getApplicationContext().getPackageName());
        iv.setImageResource(pic);

        return view;
    }

}
