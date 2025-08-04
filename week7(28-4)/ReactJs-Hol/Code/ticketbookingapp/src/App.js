
import React, { Component } from 'react';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
    isLoggedIn: false,
    };
  }

  handleLogin = () => {
  this.setState({ isLoggedIn: true });
  };


  handleLogout = () => {
this.setState({ isLoggedIn: false });
  };

  render() {

    let pageContent;

    if (this.state.isLoggedIn) {
      pageContent = (
      <div>
      <h2>Welcome Back, User!</h2>
          <p>You can now book your flights below.</p>
          <FlightDetails showBooking={true} />
          <button onClick={this.handleLogout} style={btnStyle}>Logout</button>
        </div>
      );
    } else {
  pageContent = (
      <div>
          <h2>Welcome, Guest!</h2>
        <p>Please log in to book your flight.</p>
          <FlightDetails showBooking={false} />
          <button onClick={this.handleLogin} style={btnStyle}>Login</button>
        </div>
      );
    }

    return (
      <div className="App" style={{ padding: '30px', fontFamily: 'Arial' }}>
        <h1>✈️ Ticket Booking Application</h1>
        {pageContent}
      </div>
    );
  }
}



function FlightDetails({ showBooking }) {
  return (
  <div style={cardStyle}>
      <h3>Flight Details</h3>
      <p><strong>From:</strong> Bangalore</p>
      <p><strong>To:</strong> Delhi</p>
      <p><strong>Flight No:</strong> AI-302</p>
    <p><strong>Time:</strong> 6:30 PM</p>

  
      {showBooking && (
        <button style={{ ...btnStyle, backgroundColor: '#2e7d32' }}>
          Book Now
        </button>
    )}
  </div>
  );
}




const btnStyle = {
  padding: '10px 20px',
  marginTop: '15px',
  backgroundColor: '#1976d2',
  color: 'white',
  border: 'none',
  borderRadius: '5px',
  cursor: 'pointer',
};


const cardStyle = {
  border: '1px solid #ccc',
  padding: '20px',
  marginTop: '20px',
  borderRadius: '8px',
  backgroundColor: '#f9f9f9',
  maxWidth: '400px'
};




export default App;


