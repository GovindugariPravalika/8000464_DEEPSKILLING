import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore() {
    const name = "Pravalika";
    const school = "ABC Public School";
    const total = 500;
    const goal = 450;

    const average = (goal / total) * 100;

    return (
        <div className="container">
            <h1>Student Score Calculator</h1>

            <p><strong>Name:</strong> {name}</p>
            <p><strong>School:</strong> {school}</p>
            <p><strong>Total Marks:</strong> {total}</p>
            <p><strong>Marks Obtained:</strong> {goal}</p>
            <p><strong>Average Score:</strong> {average}%</p>
        </div>
    );
}

export default CalculateScore;