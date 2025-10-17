document.addEventListener("DOMContentLoaded", function () {
    const forgotPasswordForm = document.getElementById("forgotPasswordForm");

    forgotPasswordForm.addEventListener("submit", function (e) {
        e.preventDefault();
        const email = document.getElementById("email").value;

        // Here, you would typically send a request to your server to handle the password reset process
        // For this example, we'll just display an alert message
        alert(Password reset instructions sent to ${email});
        // You can also redirect the user to a confirmation page or do further processing here
    });
});