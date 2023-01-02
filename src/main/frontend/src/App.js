import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import Home from './views/home';
import About from './views/about';
import Profile from './views/profile';
import Axios from './views/axios';

function App() {
    return (
        <BrowserRouter>
            <nav>
                <Link to='/'>Home</Link>
                <br />
                <Link to='/about'>About</Link>
                <br />
                <Link to='/profile'>Profile</Link>
                <br />
                <Link to='/axios'>Axios</Link>
            </nav>
            <header>----------------------------------</header>
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/about" element={<About />} />
                <Route path="/profile" element={<Profile />} />
                <Route path="/axios" element={<Axios />} />
            </Routes>
            <footer>----------------------------------</footer>
        </BrowserRouter>
    );
}

export default App;
