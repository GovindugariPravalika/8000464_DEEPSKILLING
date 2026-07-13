import React, { Component } from "react";

function LoginButton(props) {
    return (
        <button onClick={props.onClick}>
            Login
        </button>
    );
}

function LogoutButton(props) {
    return (
        <button onClick={props.onClick}>
            Logout
        </button>
    );
}

function GuestGreeting() {
    return (
        <div>
            <h2>Welcome Guest</h2>
            <h3>Please login to book your flight tickets.</h3>

            <h4>Available Flights</h4>

            <ul>
                <li>Hyderabad → Chennai</li>
                <li>Delhi → Mumbai</li>
                <li>Bangalore → Pune</li>
            </ul>
        </div>
    );
}

function UserGreeting() {
    return (
        <div>
            <h2>Welcome User</h2>
            <h3>You can now book your flight tickets.</h3>

            <h4>Available Flights</h4>

            <ul>
                <li>Hyderabad → Chennai</li>
                <li>Delhi → Mumbai</li>
                <li>Bangalore → Pune</li>
            </ul>

            <button>Book Ticket</button>
        </div>
    );
}

function Greeting(props) {

    if (props.isLoggedIn) {
        return <UserGreeting />;
    }

    return <GuestGreeting />;
}

class App extends Component {

    constructor(props) {
        super(props);

        this.state = {
            isLoggedIn: false
        };
    }

    handleLogin = () => {
        this.setState({
            isLoggedIn: true
        });
    };

    handleLogout = () => {
        this.setState({
            isLoggedIn: false
        });
    };

    render() {

        let button;

        if (this.state.isLoggedIn) {
            button = (
                <LogoutButton
                    onClick={this.handleLogout}
                />
            );
        } else {
            button = (
                <LoginButton
                    onClick={this.handleLogin}
                />
            );
        }

        return (

            <div style={{ padding: "20px" }}>

                <h1>Ticket Booking App</h1>

                {button}

                <hr />

                <Greeting
                    isLoggedIn={this.state.isLoggedIn}
                />

            </div>

        );
    }
}

export default App;