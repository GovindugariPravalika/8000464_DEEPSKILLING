import React, { Component } from "react";

class Register extends Component {

    constructor(props) {
        super(props);

        this.state = {
            fullName: "",
            email: "",
            password: "",
            errors: {
                fullName: "",
                email: "",
                password: ""
            }
        };
    }

    handleChange = (event) => {

        const { name, value } = event.target;
        let errors = this.state.errors;

        switch (name) {

            case "fullName":
                errors.fullName =
                    value.length < 5
                        ? "Full Name must be 5 characters long!"
                        : "";
                break;

            case "email":
                errors.email =
                    value.includes("@") && value.includes(".")
                        ? ""
                        : "Email is not valid!";
                break;

            case "password":
                errors.password =
                    value.length < 8
                        ? "Password must be 8 characters long!"
                        : "";
                break;

            default:
                break;
        }

        this.setState({
            errors,
            [name]: value
        });
    };

    validateForm = () => {

        const { errors } = this.state;

        return (
            errors.fullName === "" &&
            errors.email === "" &&
            errors.password === "" &&
            this.state.fullName !== "" &&
            this.state.email !== "" &&
            this.state.password !== ""
        );

    };

    handleSubmit = (event) => {

        event.preventDefault();

        if (this.validateForm()) {

            alert("Valid Form");

        } else {

            if (this.state.errors.fullName !== "")
                alert(this.state.errors.fullName);

            else if (this.state.errors.email !== "")
                alert(this.state.errors.email);

            else if (this.state.errors.password !== "")
                alert(this.state.errors.password);
        }
    };

    render() {

        return (

            <div>

                <h2>Register Here !!!</h2>

                <form onSubmit={this.handleSubmit}>

                    <label>Name:</label>

                    <br />

                    <input
                        type="text"
                        name="fullName"
                        value={this.state.fullName}
                        onChange={this.handleChange}
                    />

                    <br /><br />

                    <label>Email:</label>

                    <br />

                    <input
                        type="text"
                        name="email"
                        value={this.state.email}
                        onChange={this.handleChange}
                    />

                    <br /><br />

                    <label>Password:</label>

                    <br />

                    <input
                        type="password"
                        name="password"
                        value={this.state.password}
                        onChange={this.handleChange}
                    />

                    <br /><br />

                    <button type="submit">
                        Submit
                    </button>

                </form>

            </div>

        );
    }
}

export default Register;