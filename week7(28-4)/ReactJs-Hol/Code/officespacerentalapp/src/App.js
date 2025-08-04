import React from 'react';

function App() {
  const singleOffice = {
    name: "DBS",
    rent: 50000,
    address: "Chennai",
    image: "https://cdn.sanity.io/images/uqxwe2qj/production/62db3c671745e98cb27690dff96f8033d2bb7f35-2048x1010.jpg"
  };





  const officeList = [
    {
      name: "CoWrks Residency Road",
      rent: 75000,
      address: "Bangalore",
      image: "https://www.exisglobal.com/wp-content/uploads/2023/03/open-closed-office-space-pros-cons.jpg"
    },
    {
      name: "Innov8 CP",
      rent: 58000,
      address: "Delhi",
      image: "https://gustavconcept.com/cdn/shop/articles/QIC_SYD_Unispace_QIC_resized_2_copy.jpg?v=1691409476"
    },
    {
      name: "91SpringBoard",
      rent: 61000,
      address: "Hyderabad",
      image: "https://officebanao.com/wp-content/uploads/2024/06/office-with-lot-desks-computers-1200x799.jpg"
    }
  ];



  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>

      <h1>Office Space , at Affordable Range</h1>

      <img src={singleOffice.image} alt={singleOffice.name} style={{ width: '300px', borderRadius: '8px' }} />
      <p><strong>Name:</strong> {singleOffice.name}</p>
      <p><strong>Address:</strong> {singleOffice.address}</p>
      <p>
        <strong>Rent:</strong>{" "}
        <span style={{
          color: singleOffice.rent < 60000 ? 'red' : 'green'
        }}>
        ₹{singleOffice.rent}
        </span>
      </p>



      <h2>Available Offices</h2>
      {officeList.map((office, index) => (
        <section key={index} style={{
          border: '1px solid #ccc',
          padding: '10px',
          marginBottom: '10px',
          borderRadius: '5px',
          width: '320px',
          display: 'inline-block',
          marginLeft: '15px',
        }}>
          <img src={office.image} alt={office.name} style={{ width: '300px', borderRadius: '8px' }} />
          <p><strong>Name:</strong> {office.name}</p>
          <p><strong>Address:</strong> {office.address}</p>
          <p>
            <strong>Rent:</strong>{" "}
            <span style={{
              color: office.rent < 60000 ? 'red' : 'green'
            }}>
            ₹{office.rent}
            </span>
          </p>
        </section>
      ))}
    </div>
  );
}

export default App;
