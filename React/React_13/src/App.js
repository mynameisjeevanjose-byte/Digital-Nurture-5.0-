import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {

  const showBook = true;
  const showBlog = true;
  const showCourse = true;

  return (
    <div style={{ margin: "30px" }}>
      <h1>Blogger App</h1>

      {showBook && <BookDetails />}

      <hr />

      {showBlog ? <BlogDetails /> : <h3>No Blog Available</h3>}

      <hr />

      {showCourse ? <CourseDetails /> : null}

    </div>
  );
}

export default App;