package br.com.thiagojose.todolist.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FilterTaksAuth implements Filter{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        

        //Execute alguma ação
       System.out.println("Chegou no filtro");
       chain.doFilter(request, response);
       
    }
    
}
