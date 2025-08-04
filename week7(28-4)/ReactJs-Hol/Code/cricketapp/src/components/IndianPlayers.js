import React from 'react';

const IndianPlayers = () => {
    const indianTeam = ["Virat", "Rahul", "Hardik", "Ashwin", "Bumrah","Rohit", "Shreyas", "Pant", "Shami", "Jadeja"];


  function oddPlayers([first,,third,,fifth,,seventh,,ninth]) {
    return(
        <ul>
        <li>First : {first}</li>
            <li>Third : {third}</li>
            <li>Fifth : {fifth}</li>
            <li>Seventh : {seventh}</li>
            <li>Ninth : {ninth}</li>
        </ul>
    );
  }
    function evenPlayers([,second,,fourth,,sixth,,eighth,,tenth]) {
    return(
        <ul>
            <li>Second : {second}</li>
            <li>Fourth : {fourth}</li>
            <li>Sixth : {sixth}</li>
            <li>Eighth : {eighth}</li>
            <li>Tenth : {tenth}</li>
        </ul>
    );
  }

  const T20players = ["Gill", "Surya", "Samson"];
  const RanjiTrophyPlayers = ["Pujara", "Rahane", "Saha"];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Players</h2>
      
      {oddPlayers(indianTeam)}
<hr/>
      <h2>Even Players</h2>
            
        {evenPlayers(indianTeam)}
<hr/>
      <h2>List of Indian Players Merged:</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
    <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
