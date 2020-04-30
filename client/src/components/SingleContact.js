import React from 'react';

const SingleContact = ({item}) => (
  <div class="row">
  <div class="col s12 m6">
    <div class="card blue-grey darken-1">
      <div class="card-content white-text">
        <span class="card-title">{item.firstName} {item.lastName} </span>
        <p>I am a very simple card. I am good at containing small bits of information.
        I am convenient because I require little markup to use effectively.</p>
      </div>
      <div class="card-action">
        <p>{item.email}</p>
      </div>
    </div>
  </div>
</div>
);

export default SingleContact;