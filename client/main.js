const BASE_URL = "http://localhost:8080/user";
const output = document.getElementById("output");

// Register form
const registerForm = document.getElementById("registerForm");
if (registerForm) {
  registerForm.addEventListener("submit", async (e) => {
    e.preventDefault();

    const data = {
      name: document.getElementById("regName").value,
      email: document.getElementById("regEmail").value,
      phone: document.getElementById("regPhone").value,
      password: document.getElementById("regPassword").value,
    };

    try {
      const res = await fetch(BASE_URL, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(data),
      });

      const text = await res.text();
      output.textContent = `Status: ${res.status}\nResponse: ${text}`;
    } catch (err) {
      output.textContent = "Error: " + err;
    }
  });
}

// Login form
const loginForm = document.getElementById("loginForm");
if (loginForm) {
  loginForm.addEventListener("submit", async (e) => {
    e.preventDefault();

    const email = document.getElementById("loginEmail").value;

    try {
      const res = await fetch(`${BASE_URL}?email=${encodeURIComponent(email)}`, {
        method: "GET",
        headers: { "Content-Type": "application/json" },
      });

      const text = await res.text();
      output.textContent = `Status: ${res.status}\nResponse: ${text}`;
    } catch (err) {
      output.textContent = "Error: " + err;
    }
  });
}
