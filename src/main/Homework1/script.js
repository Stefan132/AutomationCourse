function clearErrors() {
  const errorContainers = document.getElementsByClassName('error');

  Array.from(errorContainers).forEach((container) => {
    container.textContent = '';
  });
}

function validateForm(event) {
  event.preventDefault(); // Prevent form submission to see the validation errors

  // Clear previous error messages
  clearErrors();

  // Check each field for empty value
  checkFieldById('name', 'nameError');
  checkFieldById('email', 'emailError');
  checkFieldById('password', 'passwordError');
  checkFieldById('confirmPassword', 'confirmPasswordError');


  // Check if passwords match
  checkPasswordsMatch('password', 'confirmPassword', 'confirmPasswordError');
}

function checkFieldById(fieldId, errorId) {
  const field = document.getElementById(fieldId);
  const errorContainer = document.getElementById(errorId);

  if (field.value === '') {
    errorContainer.textContent = 'This field is required';
  }
}

function checkPasswordsMatch(passwordId, confirmPasswordId, errorId) {
  const password = document.getElementById(passwordId).value;
  const confirmPassword = document.getElementById(confirmPasswordId).value;
  const errorContainer = document.getElementById(errorId);

  if (password !== confirmPassword) {
    errorContainer.textContent = 'Passwords do not match';
  }
}
