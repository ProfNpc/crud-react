import { Outlet, Link, NavLink } from "react-router-dom";
import React from 'react'

function Layout() {
  return (
    <>
      <nav>
        <ul>
          <li>
            <NavLink 
                to="/" 
                className={({ isActive }) => (isActive ? 'active' : 'inactive')} >
                Home
            </NavLink>
          </li>
          <li>
            <NavLink 
                to="/blogs" 
                className={({ isActive }) => (isActive ? 'active' : 'inactive')} >
                Blogs
            </NavLink>
          </li>
          <li>
            <NavLink 
                to="/contact" 
                className={({ isActive }) => (isActive ? 'active' : 'inactive')}>
                Contact
            </NavLink>
          </li>
        </ul>
      </nav>

      <Outlet />
    </>
  )
}

export default Layout