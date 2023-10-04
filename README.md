# JavaScript
This project involves using JavaScript to achieve several tasks:

1. **Checking for Username Existence:** We utilize JavaScript to verify if a username already exists in the system.

2. **Controlling Account Submissions:** JavaScript is employed to manage the submission of account creation and update forms. It ensures that submissions follow certain criteria, such as username uniqueness.

3. **Leveraging the Dynamism of the JavaScript Fetch API:** We make use of the dynamic capabilities of the JavaScript Fetch API to interact with the server without requiring a full page reload. This helps in checking username existence and handling account submissions seamlessly.

During the user validation exercise, where we create and validate users using JavaScript, we encountered several key findings:

- **CORS (Cross-Origin Resource Sharing):** We explored the concept of CORS and its implications for our project.

- **JS Code Placement:** We noticed that when directly embedding JavaScript code within the .html view, requests were made to localhost:8080, whereas using a JS reference in the .html view resulted in requests being sent to localhost:63342. We examined this behavior.

- **Password Security:** We discussed the importance of not using the '+' symbol in passwords unless the string is properly encoded. This ensures better security practices when handling passwords.

This project spans across multiple technologies and tools, including Java, JavaScript, HTML, Spring Boot, Thymeleaf, and MySQL.
