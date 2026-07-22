import { useState } from "react";
import CurrencyConvertor from "./Components/CurrencyConvertor";

function App() {

  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert("Hello! Have a nice day.");
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = (e) => {
    alert("I was clicked");
  };

  return (
    <div style={{ margin: "30px" }}>

      <h1>React Event Handling</h1>

      <h2>Counter : {count}</h2>

      <button onClick={increment}>Increment</button>

      <button onClick={decrement} style={{ marginLeft: "10px" }}>
        Decrement
      </button>

      <br /><br />

      <button onClick={() => sayWelcome("Welcome")}>
        Say Welcome
      </button>

      <br /><br />

      <button onClick={handleClick}>
        Synthetic Event
      </button>

      <hr />

      <CurrencyConvertor />

    </div>
  );
}

export default App;