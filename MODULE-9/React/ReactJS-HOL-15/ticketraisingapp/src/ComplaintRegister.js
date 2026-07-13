import React, { Component } from "react";

class ComplaintRegister extends Component {

    constructor(props) {
        super(props);

        this.state = {
            ename: "",
            complaint: "",
            numberHolder: Math.floor(Math.random() * 1000) + 1
        };
    }

    handleChange = (event) => {

        this.setState({
            [event.target.name]: event.target.value
        });

    };

    handleSubmit = (event) => {

        event.preventDefault();

        const message =
            "Thanks " +
            this.state.ename +
            "\nYour Complaint was Submitted.\nTransaction ID is: " +
            this.state.numberHolder;

        alert(message);
    };

    render() {

        return (

            <div>

                <h2>Register your complaints here !!!</h2>

                <form onSubmit={this.handleSubmit}>

                    <label>Name :</label>

                    <br />

                    <input
                        type="text"
                        name="ename"
                        value={this.state.ename}
                        onChange={this.handleChange}
                    />

                    <br /><br />

                    <label>Complaint :</label>

                    <br />

                    <textarea
                        name="complaint"
                        rows="5"
                        cols="30"
                        value={this.state.complaint}
                        onChange={this.handleChange}
                    ></textarea>

                    <br /><br />

                    <button type="submit">
                        Submit
                    </button>

                </form>

            </div>

        );

    }

}

export default ComplaintRegister;