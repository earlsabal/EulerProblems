def sum_of_evens(limit)

	previous, current, start_evens_sum = [0, 1, 0]
	sequence(previous, current, start_evens_sum, limit)

end

def sequence(previous, current, evens_sum, limit)

	return evens_sum if current >= limit
	sum = previous + current
	sum % 2 == 0 ? new_sum = evens_sum + sum : new_sum = evens_sum
	sequence(current, sum, new_sum, limit)

end

# Tracks time
start = Time.now
puts sum_of_evens(4000000)
puts "Execution time: #{Time.now - start}"

# Answer: 4613732
# Time Elasped: 0.000048
