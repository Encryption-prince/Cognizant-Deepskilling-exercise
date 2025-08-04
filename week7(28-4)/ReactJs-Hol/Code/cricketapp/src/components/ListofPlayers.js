import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 90 },
    { name: "Rohit", score: 85 },
    { name: "Rahul", score: 45 },
    { name: "Shreyas", score: 60 },
    { name: "Hardik", score: 75 },
    { name: "Pant", score: 80 },
    { name: "Ashwin", score: 30 },
    { name: "Shami", score: 50 },
    { name: "Bumrah", score: 55 },
    { name: "Jadeja", score: 95 },
    { name: "Gill", score: 65 },
  ];




  const lowScorePlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {players.map((player, index) => (
    <li key={index}>Mr. {player.name} <span>{player.score}</span></li>
        ))}
      </ul>
        <hr />
      <h2>List of Players having Scores less than 70</h2>
      <ul>
        {lowScorePlayers.map((player, index) => (
        <li key={index}>Mr. {player.name} <span>{player.score}</span></li>
        ))}
      </ul>
    </div>
  );
};
export default ListofPlayers;
