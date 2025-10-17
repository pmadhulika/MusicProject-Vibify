public class InputSanitizationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        Map<String, String[]> sanitizedParams = sanitizeInputs(httpRequest.getParameterMap());
        
        chain.doFilter(new SanitizedRequestWrapper(httpRequest, sanitizedParams), response);
    }

    private Map<String, String[]> sanitizeInputs(Map<String, String[]> inputParams) {
        // Apply sanitization rules ONCE for all requests
        return sanitizedParams;
    }
}