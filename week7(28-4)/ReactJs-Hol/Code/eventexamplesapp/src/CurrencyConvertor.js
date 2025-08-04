// src/CurrencyConvertor.js
import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: '',
      euro: '',
    };
  }

  handleChange = (event) => {
    this.setState({ rupees: event.target.value });
  };

  handleSubmit = (event) => {
    event.preventDefault();
    const euroValue = (this.state.rupees / 89).toFixed(2); 
    this.setState({ euro: euroValue });
  };

  render() {
    return (
      <div>
        <h1 style={{ color: 'green'}}>Currency Convertor!!!</h1>
        <form onSubmit={this.handleSubmit}>
          <input
            type="number"
            value={this.state.rupees}
            onChange={this.handleChange}
            placeholder="Enter amount in INR"
            style={{ padding: '8px', width: '200px' }}
          />
          <br/><br/>
          <button type="submit"
           style={{
             marginLeft: '10px'
          }}>
            Convert
          </button>
        </form>
        {this.state.euro && (
          <p><strong>Converted Value:</strong> €{this.state.euro}</p>
        )}
      </div>
    );
  }
}



export default CurrencyConvertor;
