package pri.weiqiang.myjapanese.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.View;

import butterknife.BindView;
import pri.weiqiang.myjapanese.R;
import pri.weiqiang.myjapanese.rxbus.RxBus;
import pri.weiqiang.myjapanese.rxbus.event.EventContainer;
import pri.weiqiang.myjapanese.rxbus.event.GameEvent;

public class GameFragment extends BaseFragment {

    @BindView(R.id.cv_puzzle)
    CardView mPuzzleCardView;
    @BindView(R.id.cv_supperzzle)
    CardView mSupperzzleCardView;

    @Override
    protected int getViewId() {
        return R.layout.fragment_game;
    }

    @Override
    protected void initVariable(@Nullable Bundle savedInstanceState) {

        mPuzzleCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RxBus.getDefault().post(new EventContainer(EventContainer.TYPE_GAME, new GameEvent(GameEvent.TYPE_PUZZLE)));
            }
        });

        mSupperzzleCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RxBus.getDefault().post(new EventContainer(EventContainer.TYPE_GAME, new GameEvent(GameEvent.TYPE_SUPPERZZLE)));
            }
        });

    }

    @Override
    protected void doAction() {

    }


}
