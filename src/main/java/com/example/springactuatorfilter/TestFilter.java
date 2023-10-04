package com.example.springactuatorfilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class TestFilter extends OncePerRequestFilter {

    public static final ThreadLocal<String> CONTEXT = new ThreadLocal<>();

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        CONTEXT.set("filter was called");
        try {
            filterChain.doFilter(request, response);
        }
        finally {
            CONTEXT.remove();
        }
    }
}
