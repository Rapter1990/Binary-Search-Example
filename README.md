<h1>Binary Search Example</h1>

<ul>
  <li>This method is used to search the provided list for the specified object using the binary search algorithm. The list must be sorted into ascending order according to the specified natural number, prior to making the method call. If the list is not sorted, the results are undefined</li>
  <li>This java example shows how to search an element of Java ArrayList using binarySearch method of Collections class. binarySearch method usesbinary search algorithm to search an element.</li>
</ul>

<h3>The objective of Program</h3>
<ul>
  <li>The program firstly reads a long file containing above 90000 objects and set each object into the City and implement search process in terms of name of city, substring name of city and one character.</li>
</ul>


<h3>Files contaning in this repository</h3>
<ul>
  <li>src
    <ul>
      <li>files
        <ul>
          <li>cities.txt</li>
          <li>output.txt</li>
        </ul>
      </li>
      <li>main
        <ul>
          <li>Main.java</li>
        </ul>
      </li>
      <li>model
        <ul>
          <li>City.java</li>
        </ul>
      </li>
      <li>util
        <ul>
          <li>BinarySearch.java</li>
          <li>ProcessMethod.java</li>
          <li>ReadFile.java</li>
          <li>ShowResult.java</li>
          <li>WriteFile.java</li>
        </ul>
      </li>
    </ul>
  </li>
</ul>

<h3>Explaining an inforamtion of each file</h3>

<table>
  <tr>
    <th>Files Names</th>
    <th>Information</th>
  </tr>
  <tr>
    <td>cities.txt</td>
    <td>Contaning the infomation of city (its weight,its name and lastly its country)</td>
  </tr>
  <tr>
    <td>output.txt</td>
    <td>Show the result of search process in terms of  name of city, substring name of city and one character with being sensitive for lowercase and uppercase</td>
  </tr>
  <tr>
    <td>Main.java</td>
    <td>Handle with all project files to run the program</td>
  </tr>
  <tr>
    <td>City.java</td>
    <td>Defining it as a POJO</td>
  </tr>
  <tr>
    <td>BinarySearch.java</td>
    <td>Implementing search algorithm for name of city, substring name of city and one character </td>
  </tr>
  <tr>
    <td>ProcessMethod.java</td>
    <td>Managing all search algorithm via defined function</td>
  </tr>
  <tr>
    <td>ReadFile.java</td>
    <td>Reading cities.txt and assign each variable to City Object</td>
  </tr>
  <tr>
    <td>ShowResult.java</td>
    <td>Showing the search result</td>
  </tr>
  <tr>
    <td>WriteFile.java</td>
    <td>Writing all the search result into the output.txt</td>
  </tr>
</table>

