// src/App.js
import React from 'react';
import BookDetails, { books } from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import './App.css';

function App() {
  return (
    <div>
      <div style={{ display: 'flex', justifyContent: 'space-around' }}>
        <CourseDetails />
        <BookDetails books={books} />
        <BlogDetails style={{ backgroundColor: 'green', }}/>
        
      </div>
    </div>
  );
}

export default App;
