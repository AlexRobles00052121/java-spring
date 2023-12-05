// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsers();
  $('#users').DataTable();
});

async function loadUsers(){
  const request =  await fetch('users', {
    method: 'GET',
    headers: {
      'accept': 'application/json',
      'content-type': 'application/json'
    },
  });
    const users = await request.json();
    //console.log(users);

    let listHtml = '';
    for (let user of users){
      let userRows = '<tr><td>'+user.id+'</td> <td>'+user.name+' ' + user.lastname + '</td> <td>' + user.email + '</td> <td>'+user.phone+'</td> <td><a href="#" class="btn btn-danger btn-circle btn-sm"> <i class="fas fa-trash"></i> </a> </td> </tr>'
      listHtml += userRows;
    }

    document.querySelector('#users tbody').innerHTML = listHtml;
}
