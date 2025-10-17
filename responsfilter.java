public class ResponseEncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        // Wrap response to encode outputs
        chain.doFilter(request, new EncodedResponseWrapper(httpResponse));
    }
}