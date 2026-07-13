import "./App.css";

function App() {

  const image =
    "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=800";

  const officeSpaces = [

    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },

    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore"
    },

    {
      Name: "WeWork",
      Rent: 65000,
      Address: "Hyderabad"
    }

  ];

  return (

    <div className="App">

      <h1>Office Space, at Affordable Range</h1>

      <img
        src={image}
        alt="Office Space"
        width="30%"
      />

      <br />
      <br />

      {officeSpaces.map((office, index) => (

        <div key={index}>

          <h2>Name: {office.Name}</h2>

          <h3
            style={{
              color: office.Rent <= 60000 ? "red" : "green"
            }}
          >
            Rent: Rs. {office.Rent}
          </h3>

          <h3>Address: {office.Address}</h3>

          <hr />

        </div>

      ))}

    </div>

  );
}

export default App;