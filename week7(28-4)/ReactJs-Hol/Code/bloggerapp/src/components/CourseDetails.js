// src/components/CourseDetails.js
import React from 'react';

const CourseDetails = () => {
  const coursedet = (
    <ul>
      <div>
        <h3>Angular</h3>
        <p>4/5/2021</p>
      </div>
      <div>
        <h3>React</h3>
        <p>6/3/20201</p>
      </div>
    </ul>
  );

  return (
    <div className="mystyle1" style={{borderRight: '5px solid green'}}>
      <h1>Course Details</h1>
      {coursedet}
    </div>
  );
};

export default CourseDetails;
