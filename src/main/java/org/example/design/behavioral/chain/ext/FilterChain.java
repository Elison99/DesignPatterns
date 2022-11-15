package org.example.design.behavioral.chain.ext;


import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{

    //记录当前执行的步骤
    int cursor = 0;
    //filter的链
    List<Filter> filtersChain = new ArrayList<>();

    //最终要执行的目标方法
    My target;

    //添加filter
    void addFilter(Filter filter){
        filtersChain.add(filter);
    }

    public void setTarget(My target) {
        this.target = target;
    }

    public My getTarget() {
        return target;
    }



    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        //第一次执行第一个filter，一次往下

        //游标小于总数量filter一直往下获取执行
        if (cursor<filtersChain.size()){
            Filter filter = filtersChain.get(cursor);
            cursor++;
            //执行filter
            filter.doFilter(request,response,filterChain);
        }else {
            //filter完了，该执行目标方法了
            target.hello();
        }

    }
}
