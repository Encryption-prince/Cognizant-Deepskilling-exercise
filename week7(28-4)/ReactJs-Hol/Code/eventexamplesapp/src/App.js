// src/App.js
import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0,
    };
  }


  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
  };

  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  };


  sayHello = () => {
    console.log("Hello from eventexamplesapp!");
    alert("Hello from eventexamplesapp!");
  };

  handleIncrease = () => {
    this.increment();
    this.sayHello();
  };

  sayWelcome = (message) => {
    alert(message);
  };

  handleSyntheticEvent = (e) => {
    alert("I was clicked");
  };

  render() {
    return (
      <div style={{ padding: "30px", fontFamily: "Arial" }}>


        <h2>Counter: {this.state.counter}</h2>


        <button onClick={this.handleIncrease}>Increment</button>
        <br/><br/>
        <button onClick={this.decrement}>Decrement</button>

        <br /><br />


        <button
          onClick={() => this.sayWelcome("Welcome")}>
          Say welcome
        </button>

        <br /><br />


        <button
          onClick={this.handleSyntheticEvent}>
          Click on me
        </button>

        <br /><br />

        <CurrencyConvertor />
      </div>
    );
  }
}

const btnStyle = {
  padding: "10px 20px",
  margin: "5px",
  backgroundColor: "#1976d2",
  color: "white",
  border: "none",
  borderRadius: "4px",
  cursor: "pointer"
};

export default App;
