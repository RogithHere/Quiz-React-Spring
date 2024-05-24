import './App.css'
import {BrowserRouter,Routes,Route} from 'react-router-dom'
import 'bootstrap/dist/css/bootstrap.min.css'
import Main from './components/Main'

function App() {
  return (
    <div>
      <BrowserRouter>
      <Routes>
      <Route path='/' element={<Main />}></Route>
      </Routes>
      </BrowserRouter>
    </div>
  )
}

export default App
