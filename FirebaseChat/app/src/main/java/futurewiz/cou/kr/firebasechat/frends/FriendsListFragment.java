package futurewiz.cou.kr.firebasechat.frends;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import futurewiz.cou.kr.firebasechat.R;
import futurewiz.cou.kr.firebasechat.base.BaseFragment;
import futurewiz.cou.kr.firebasechat.chat.ChattingActivity;

/**
 * Created by bag-yongtae on 2017. 12. 15..
 */

public class FriendsListFragment extends BaseFragment {

    public FriendsListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setView(inflater.inflate(R.layout.fragment_friends_list, container, false));

        return view;
    }
}