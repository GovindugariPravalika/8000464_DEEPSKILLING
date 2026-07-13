import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

    const books = [

        {
            id: 1,
            bname: "Master React",
            price: 670
        },

        {
            id: 2,
            bname: "Deep Dive into Angular 11",
            price: 800
        },

        {
            id: 3,
            bname: "Mongo Essentials",
            price: 450
        }

    ];

    const blogs = [

        {
            id: 1,
            title: "React Learning",
            author: "Stephen Biz",
            description: "Welcome to learning React!"
        },

        {
            id: 2,
            title: "Installation",
            author: "Schwezdenier",
            description: "You can install React from npm."
        }

    ];

    const courses = [

        {
            id: 1,
            cname: "Angular",
            date: "4/5/2021"
        },

        {
            id: 2,
            cname: "React",
            date: "6/3/2021"
        }

    ];

    const showCourses = true;
    const showBooks = true;
    const showBlogs = true;

    return (

        <div style={{ padding: "20px" }}>

            <h1>React App</h1>

            {showCourses ? (
                <CourseDetails courses={courses} />
            ) : null}

            {showBooks && (
                <BookDetails books={books} />
            )}

            {showBlogs ? (
                <BlogDetails blogs={blogs} />
            ) : (
                <h2>No Blogs Available</h2>
            )}

        </div>

    );

}

export default App;