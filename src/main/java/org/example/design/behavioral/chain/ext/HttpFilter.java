package org.example.design.behavioral.chain.ext;

public class HttpFilter implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        //第一个filter的功能
        request.msg+=">>>";

        System.out.println("HttpFilter...doFilter之前");

        //放行
        filterChain.doFilter(request,response,filterChain);

        System.out.println("HttpFilter...doFilter之后");
    }
}
