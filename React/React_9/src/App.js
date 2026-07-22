import office from "./office.jpg";

function App() {

  const offices = [
    {
      name: "DBS",
      rent: 50000,
      address: "Chennai"
    },
    {
      name: "Regus",
      rent: 75000,
      address: "Bangalore"
    },
    {
      name: "WeWork",
      rent: 90000,
      address: "Hyderabad"
    }
  ];

  return (
    <div style={{ marginLeft: "40px" }}>
      <h1>Office Space, at Affordable Range</h1>

      <img src={office} alt="Office" width="300" />

      {offices.map((item, index) => (
        <div key={index}>
          <h2>Name: {item.name}</h2>

          <h3 style={{ color: item.rent <= 60000 ? "red" : "green" }}>
            Rent: Rs. {item.rent}
          </h3>

          <h3>Address: {item.address}</h3>

          <hr />
        </div>
      ))}
    </div>
  );
}

export default App;