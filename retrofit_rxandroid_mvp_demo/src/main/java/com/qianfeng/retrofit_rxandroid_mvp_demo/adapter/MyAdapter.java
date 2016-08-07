package com.qianfeng.retrofit_rxandroid_mvp_demo.adapter;

//                            _ooOoo_  
//                           o8888888o  
//                           88" . "88  
//                           (| -_- |)  
//                            O\ = /O  
//                        ____/`---'\____  
//                      .   ' \\| |// `.  
//                       / \\||| : |||// \  
//                     / _||||| -:- |||||- \  
//                       | | \\\ - /// | |  
//                     | \_| ''\---/'' | |  
//                      \ .-\__ `-` ___/-. /  
//                   ___`. .' /--.--\ `. . __  
//                ."" '< `.___\_<|>_/___.' >'"".  
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |  
//                 \ \ `-. \_ __\ /__ _/ .-` / /  
//         ======`-.____`-.___\_____/___.-`____.-'======  
//                            `=---='  
//  
//         .............................................  
//                  佛祖镇楼                  BUG辟易  
//          佛曰:  
//                  写字楼里写字间，写字间里程序员；  
//                  程序人员写程序，又拿程序换酒钱。  
//                  酒醒只在网上坐，酒醉还来网下眠；  
//                  酒醉酒醒日复日，网上网下年复年。  
//                  但愿老死电脑间，不愿鞠躬老板前；  
//                  奔驰宝马贵者趣，公交自行程序员。  
//                  别人笑我忒疯癫，我笑自己命太贱；  
//                  不见满街漂亮妹，哪个归得程序员？  

import android.widget.ImageView;
import android.widget.TextView;

import com.qianfeng.retrofit_rxandroid_mvp_demo.R;
import com.qianfeng.retrofit_rxandroid_mvp_demo.bean.Cook;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by jackiechan on 16/8/7.
 */
public class MyAdapter extends MyBaseAdapter<Cook> {
    private List<Cook> list;
    public MyAdapter(int id, List<Cook> list) {
        super(id, list);
        this.list = list;
    }

    @Override
    public void fillData(int position, MyHolder myHolder) {
        Cook cook = list.get(position);
        ((TextView) myHolder.findView(R.id.name)).setText(cook.getName());
        ((TextView) myHolder.findView(R.id.des)).setText(cook.getDescription());
        Picasso.with(myHolder.getmConvertView().getContext()).load("http://tnfs.tngou.net/image"+cook.getImg()).into((ImageView) myHolder.findView(R.id.iv));

    }
}
